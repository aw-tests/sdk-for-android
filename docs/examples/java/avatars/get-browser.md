import io.appwrite.Client;
import io.appwrite.coroutines.CoroutineCallback;
import io.appwrite.services.Avatars;


import io.appwrite.enums.Browser;

import io.appwrite.enums.CreditCard;


import io.appwrite.enums.Flag;




Client client = new Client(context)
    .setEndpoint("https://cloud.appwrite.io/v1") // Your API Endpoint
    .setProject("5df5acd0d48c2"); // Your project ID

Avatars avatars = new Avatars(client);

avatars.getBrowser(
    Browser.AA,
    new CoroutineCallback<>((result, error) -> {
        if (error != null) {
            error.printStackTrace();
            return;
        }

        Log.d("Appwrite", result.toString());
    })
);