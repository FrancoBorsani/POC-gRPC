package client;

import com.medicamentos_management.stubs.result.ResultRequest;
import com.medicamentos_management.stubs.result.ResultResponse;
import com.medicamentos_management.stubs.result.ResultServiceGrpc;
import com.medicamentos_management.stubs.result.TipoMedicamento;
import io.grpc.Channel;

import java.util.ArrayList;
import java.util.List;

public class ResultClient {
    // Blocking stub means that the requests are blocked until the responses are come for previous requests
    // There are some other options as well, apart from Blocking stub, you can try those
    // But in this case let's go with this one
    private ResultServiceGrpc.ResultServiceBlockingStub resultServiceBlockingStub;

    // To create the blocking stub, we need something called a channel
    // This channel is passed by the calling service.
    // So, when we call this method from the student service class, we have to provide the channel
    // Now, just add this code and we will see what is a channel in student service
    public ResultClient(Channel channel){
        resultServiceBlockingStub = ResultServiceGrpc.newBlockingStub(channel);
    }

    // This method will create a request for you and get the response back from the result service and sent it to you
    public List<String> getResults(int id){
        // Creating the request object
        ResultRequest resultRequest = ResultRequest.newBuilder().setId(id).build();
        // Getting the response back
        ResultResponse resultResponse = resultServiceBlockingStub.getResultForMedicamento(resultRequest);

        // Send it to the caller, in an appropriate manner in this case as a list.
        List<String> results = new ArrayList<>();
        results.add(resultResponse.getTipo().toString());

        return results;
    }


    // This method will create a request for you and get the response back from the result service and sent it to you
    public List<String> getResultsAltaMedicamento(int id){
        // Creating the request object
        ResultRequest resultRequest = ResultRequest.newBuilder().setId(id).build();
        // Getting the response back
        TipoMedicamento resultResponse = resultServiceBlockingStub.getResultForTipoMedicamento(resultRequest);

        // Send it to the caller, in an appropriate manner in this case as a list.
        List<String> results = new ArrayList<>();

        return results;
    }



}