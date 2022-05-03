"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Client = void 0;
const service_utils_1 = require("@fern-typescript/service-utils");
class Client {
    constructor(args) {
        var _a;
        this.fetcher = (_a = args.fetcher) !== null && _a !== void 0 ? _a : service_utils_1.defaultFetcher;
        this.baseUrl = (0, service_utils_1.joinPaths)(args.serverUrl, args.serviceBaseUrl);
        this.token = args.token;
    }
    async search(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}`),
            method: "GET",
            headers: {},
            token: this.token,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
    async createResource(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}`),
            method: "POST",
            headers: {},
            token: this.token,
            body: request.body,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
    async readResource(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}`),
            method: "GET",
            headers: {},
            token: this.token,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
    async updateResource(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}`),
            method: "PUT",
            headers: {},
            token: this.token,
            body: request.body,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
    async deleteResource(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}`),
            method: "DELETE",
            headers: {},
            token: this.token,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
    async readResourceHistory(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}/_history`),
            method: "GET",
            headers: {},
            token: this.token,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
    async readVersion(request) {
        const response = await this.fetcher({
            url: (0, service_utils_1.joinPaths)(this.baseUrl, `/fhir/R4/${request.resourceType}/${request.id}/_history/${request.versionId}`),
            method: "GET",
            headers: {},
            token: this.token,
        });
        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body,
            };
        }
        else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body,
            };
        }
    }
}
exports.Client = Client;
//# sourceMappingURL=FhirService.js.map