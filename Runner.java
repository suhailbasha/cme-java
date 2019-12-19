/**
 * @author Sebastian Demian - sebastian.demian@cmegroup.com
 * @since 9/20/18
 */
public class Runner {

  public static void main(String[] args) {

    final String KEY_PATH = "https://github.com/suhailbasha/cme-java/blob/master/sample-259507-d68a745117b4.json";
    final String PROJECT_ID = "sample-259507";
    final String SUBSCRIPTION_ID = "sub_one";

    OrderedPubSubListener listener = new OrderedPubSubListener(KEY_PATH, PROJECT_ID, SUBSCRIPTION_ID);

    try {

      listener.start();

    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }

}
