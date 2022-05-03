import { Service } from "@fern-typescript/service-utils";
import * as endpoints from "./endpoints";
export interface Client {
    search(request: endpoints.search.Request): Promise<endpoints.search.Response>;
    createResource(request: endpoints.createResource.Request): Promise<endpoints.createResource.Response>;
    readResource(request: endpoints.readResource.Request): Promise<endpoints.readResource.Response>;
    updateResource(request: endpoints.updateResource.Request): Promise<endpoints.updateResource.Response>;
    deleteResource(request: endpoints.deleteResource.Request): Promise<endpoints.deleteResource.Response>;
    readResourceHistory(request: endpoints.readResourceHistory.Request): Promise<endpoints.readResourceHistory.Response>;
    readVersion(request: endpoints.readVersion.Request): Promise<endpoints.readVersion.Response>;
}
export declare class Client implements Client {
    private baseUrl;
    private fetcher;
    private token;
    constructor(args: Service.Init);
}
