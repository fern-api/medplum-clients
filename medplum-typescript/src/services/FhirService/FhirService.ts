import { defaultFetcher, Fetcher, joinPaths, Service } from "@fern-typescript/service-utils";
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

export class Client implements Client {
    private baseUrl: string;
    private fetcher: Fetcher;

    constructor(args: Service.Init) {
        this.fetcher = args.fetcher ?? defaultFetcher;
        this.baseUrl = joinPaths(args.serverUrl, args.serviceBaseUrl);
    }

    public async search(request: endpoints.search.Request): Promise<endpoints.search.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}`),
            method: "GET",
            headers: {}
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.search.ErrorBody
            };
        }
    }

    public async createResource(request: endpoints.createResource.Request): Promise<endpoints.createResource.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}`),
            method: "POST",
            headers: {},
            body: request.body
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body as endpoints.createResource.ResponseBody
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.createResource.ErrorBody
            };
        }
    }

    public async readResource(request: endpoints.readResource.Request): Promise<endpoints.readResource.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}`),
            method: "GET",
            headers: {}
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.readResource.ErrorBody
            };
        }
    }

    public async updateResource(request: endpoints.updateResource.Request): Promise<endpoints.updateResource.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}`),
            method: "PUT",
            headers: {},
            body: request.body
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body as endpoints.updateResource.ResponseBody
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.updateResource.ErrorBody
            };
        }
    }

    public async deleteResource(request: endpoints.deleteResource.Request): Promise<endpoints.deleteResource.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}`),
            method: "DELETE",
            headers: {}
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.deleteResource.ErrorBody
            };
        }
    }

    public async readResourceHistory(request: endpoints.readResourceHistory.Request): Promise<endpoints.readResourceHistory.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}/_history`),
            method: "GET",
            headers: {}
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.readResourceHistory.ErrorBody
            };
        }
    }

    public async readVersion(request: endpoints.readVersion.Request): Promise<endpoints.readVersion.Response> {
        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}/_history/${request.versionId}`),
            method: "GET",
            headers: {}
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.readVersion.ErrorBody
            };
        }
    }
}
