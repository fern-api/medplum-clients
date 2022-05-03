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

Checkout the [sample app](./medplum-typescript/packages/medplum-sample-application/src/index.ts) and write your own code! You can run it with:

```bash
yarn workspace medplum-sample-application run compile && node packages/medplum-sample-application/lib/index.js
```

## Java Client

The Java client lives inside of the [medplum-java](./medplum-java) folder.

Run `./gradlew idea && open *.ipr` inside of [medplum-java](./medplum-java) to open in Intellij.

Build the project to generate [Immutables](https://immutables.github.io/) classes. This may take a while!

Checkout the [sample app](./medplum-java/medplum-sample-application/src/main/java/com/sample/Main.java) and write your own code! Make sure to add your access key as an environment variable `MEDPLUM_ACCESS_KEY`.

## Known Limitations

- Enums that are not alphabetic are not currently supported. Tracked [here](https://github.com/fern-api/fern/issues/62).
- [fern.sh](/fern.sh) is hardcoded but we are working on a flexible CLI that can be installed via brew.
