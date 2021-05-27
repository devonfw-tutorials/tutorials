@Named
public class UcMyUseCaseImpl extends MyUseCaseBase implements UcMyUseCase {
  @Inject
  private ServiceClientFactory serviceClientFactory;

  private void callSynchronous(MyArgs myArgs) {
    MyService myService = this.serviceClientFactory.create(MyService.class);
    // call of service over the wire, synchronously blocking until result is received or error occurred
    MyResult myResult = myService.myMethod(myArgs);
    handleResult(myResult);
  }
