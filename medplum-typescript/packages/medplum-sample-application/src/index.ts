import { FhirService } from "medplum";

// TODO fill me out!
const TOKEN = "";
const PRACTITIONER_ID = "";

async function main() {
    console.log();

    if (TOKEN.length === 0) {
        console.log("Error! You're missing a token.");
        return;
    }
    if (PRACTITIONER_ID.length === 0) {
        console.log("Error! Cannot fetch practitioner because no ID is specified.");
        return;
    }

    const client = new FhirService.Client({
        serverUrl: "https://api.medplum.com/",
        token: TOKEN,
    });

    console.log("Fetching a practitioner...");

    try {
        const resource = await client.readResource({
            resourceType: "Practitioner",
            id: PRACTITIONER_ID,
        });
        if (!resource.ok) {
            console.log("Oops, the server returned an error!");
        } else if (resource.body.resourceType !== "Practitioner") {
            console.log("Hmmmm, the server didn't return a practitioner");
        } else {
            console.log("The practitioner is", resource.body);
        }
    } catch (e) {
        console.error("There was an error with the network call. Maybe this response wasn't JSON?");
    }
}

main();
