import { FhirService } from "medplum";

// TODO fill me out!
const TOKEN = "";

async function main() {
    console.log("\n\n");

    if (TOKEN.length === 0) {
        console.log("Error! You need a token in: " + __filename);
        return;
    }

    const client = new FhirService.Client({
        serverUrl: "https://api.medplum.com/",
        token: TOKEN,
    });

    console.log("Reading a pracitioner...");

    try {
        const resource = await client.readResource({
            resourceType: "Practitioner",
            id: "576b4c88-ad0b-4a1a-9b50-3921bb87ca79",
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
