# Medplum Clients

This repo contains Java and TypeScript clients for [Medplum](https://www.medplum.com/).

These clients were auto-generated using [fern](https://github.com/fern-api/fern). The [Fern API spec](./api/fhir.yml) was auto-generated from the [Medplum OpenAPI spec](https://api.medplum.com/openapi.json).

## Typescript Client

The Typescript client lives inside of the [medplum-typescript](./medplum-typescript) folder.

```bash
cd medplum-typescript
yarn # install dependencies
yarn compile # compile TypeScript into JavaScript
```

Check out the [sample app](./medplum-typescript/packages/medplum-sample-application/src/index.ts) and write your own code! You can run it with:

```bash
yarn workspace medplum-sample-application run compile && node packages/medplum-sample-application/lib/index.js
```

## Java Client

The Java client lives inside of the [medplum-java](./medplum-java) folder.

Open in Intellij by running these commands:

```bash
cd medplum-java
./gradlew idea && open *.ipr
```

Build the project `(Build > Build Project)` to generate [Immutables](https://immutables.github.io/) classes. This may take a while because the API spec is large (~12k lines).

Check out the [sample app](./medplum-java/medplum-sample-application/src/main/java/com/sample/Main.java) and write your own code! 

Before you run the sample app, make sure to add your `CLIENT_ID` and `CLIENT_SECRET` to the [.env file](./medplum-java/medplum-sample-application/.env).


#### Important Files

[FhirService.java](./medplum-java/medplum-java-client/src/generated/java/com/medplum/services/fhir/FhirService.java) is the generated REST service that has endpoints like `readResource`, `updateResource`, etc.

[ResourceList.java](./medplum-java/medplum-java-client/src/generated/java/com/medplum/types/fhir/ResourceList.java) is a union type. Union types can be visited by calling the `accept` method and passing in a visitor so that a client can be sure they handle all possible states.

[SampleApplication/Main.java](./medplum-sample-application//src/main/java/com/sample/Main.java) is an example of how to consume the java client.

## Known Limitations

- Enums that are not alphabetic are not currently supported. Tracked [here](https://github.com/fern-api/fern/issues/62).
- [fern.sh](/fern.sh) is hardcoded but we are working on a flexible CLI that can be installed via brew.
