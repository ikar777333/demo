package com.example.grpc;

public class Main {
    public static void main(String[] args) {

//        GreetingProtos.Greeting.Builder greetingBuilder = GreetingProtos.Greeting.newBuilder();
//        greetingBuilder.setGreeting(HELLO_WORLD);
//        GreetingProtos.Greeting greeting = greetingBuilder.build();
//        try {
//            // 2 : Write the message into a file. Serialize the object.
//            FileOutputStream output = new FileOutputStream(SER_FILE);
//            greeting.writeTo(output);
//            output.close();
//            // 3 : Deserialize the object from the file.
//            GreetingProtos.Greeting greetingFromFile = GreetingProtos.Greeting.parseFrom(new FileInputStream(
//                    SER_FILE));
//            logger.debug("We read this from the file {}", greetingFromFile);
//            // 4 : All is well?
//            assertEquals(HELLO_WORLD, greetingFromFile.getGreeting());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
