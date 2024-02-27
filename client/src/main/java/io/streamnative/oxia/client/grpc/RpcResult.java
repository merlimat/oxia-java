package io.streamnative.oxia.client.grpc;

import io.grpc.stub.StreamObserver;
import java.util.function.Consumer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RpcResult<T> implements StreamObserver<T> {

    private final Consumer<T> resultHandler;
    private final Consumer<Throwable> errorHandler;

    @Override
    public void onNext(T value) {
        resultHandler.accept(value);
    }

    @Override
    public void onCompleted() {}

    @Override
    public void onError(Throwable t) {
        errorHandler.accept(t);
    }
}
