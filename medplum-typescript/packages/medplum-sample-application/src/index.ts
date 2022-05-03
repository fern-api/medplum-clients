import { FhirService } from "medplum";

// TODO fill me out!
const TOKEN =
    "eyJhbGciOiJSUzI1NiIsImtpZCI6Ijk5MjI2MjNmLTVmMjctNDFiYi04NTQ1LTZkY2IwZmVkODk4MSIsInR5cCI6IkpXVCJ9.eyJsb2dpbl9pZCI6IjVhYTUxYWQyLTI2NjMtNDQzZC1hMDdkLTBiYTVkNmE2MjhmOCIsImNsaWVudF9pZCI6IjkyZGQ5OTIwLTE3OTUtNDkxNS05NDQzLTk4Yjk3OGU1NjFmNiIsInN1YiI6IjkyZGQ5OTIwLTE3OTUtNDkxNS05NDQzLTk4Yjk3OGU1NjFmNiIsInVzZXJuYW1lIjoiOTJkZDk5MjAtMTc5NS00OTE1LTk0NDMtOThiOTc4ZTU2MWY2IiwicHJvZmlsZSI6IkNsaWVudEFwcGxpY2F0aW9uLzkyZGQ5OTIwLTE3OTUtNDkxNS05NDQzLTk4Yjk3OGU1NjFmNiIsImlhdCI6MTY1MTUzNTE0MywiaXNzIjoiaHR0cHM6Ly9hcGkubWVkcGx1bS5jb20vIiwiYXVkIjoiOTJkZDk5MjAtMTc5NS00OTE1LTk0NDMtOThiOTc4ZTU2MWY2IiwiZXhwIjoxNjUxNTM4NzQzfQ.W4FOrJ4Kr5bH-WZjyX3uKW6NnEJsCckqc-kCJGKqZFBZfYJVONadM52fEe5I3uJvcc7tEAEcV2vjZQBBACJBsCoEvZASq9obUarqXSYiLdb1FrQGpo-Z0eCe2PPSbBhTkPYxVYJZ8658QHr_6xGjV8LovIpMzOTSfPAHkdBRfrrUJPiLkf2n5nEVFR2KNWsehASvZSYVBR1Is8uBN3MuSMCXzuxtB_m3gO_2piBeME5cb4XFVOF6B-IBJMLvhJ55i6leymOJtQdup7OCowLf254uwbTdL2s4fQZYEvc457kV30poiEvrrZiPTSdOuCEnnzIbZQt-CzKvQw84j4rjMw";

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
