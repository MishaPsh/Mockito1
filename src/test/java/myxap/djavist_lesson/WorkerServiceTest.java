package myxap.djavist_lesson;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WorkerServiceTest {
    @InjectMocks
    private WorkerService workerService;
    @Mock
    private WorkerRepository workerRepository;

    @Test
    void sumOfSalaries() {
        Worker worker1 = new Worker(1, "Вася", 100_000);
        Worker worker2 = new Worker(2, "Петя", 150_000);
        Mockito.when(workerRepository.findAll()).thenReturn(Arrays.asList(worker1, worker2));
        int sumOfSalariesOfAllWorkers =  workerService.getSumOfSalariesOfAllWorkers();
        assertEquals(250_000, sumOfSalariesOfAllWorkers);
    }

    @Test
    void hireWithLowSalaryThrowsException(){
        Worker worker1 = new Worker(1,"Олег", 15_000);
        assertThrows(TooLowSalaryException.class, ()->workerService.hireWorker(worker1));
    }
    @Test
    void hireWithValidSalarySavesWorker(){
        Worker worker1 = new Worker(1,"Петро", 20_000);
        workerService.hireWorker(worker1);
        Mockito.verify(workerRepository,Mockito.times(1)).save(worker1);


    }

}




















