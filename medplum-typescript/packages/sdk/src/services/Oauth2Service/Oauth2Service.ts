import {
    defaultFetcher,
    Fetcher,
    joinPaths,
    Service,
} from "@fern-typescript/service-utils";
import * as model from "../../model";
import * as endpoints from "./endpoints";

export interface Client {
    getToken(
        request: endpoints.getToken.Request
    ): Promise<endpoints.getToken.Response>;
}

export class Client implements Client {
    private baseUrl: string;
    private fetcher: Fetcher;
    private token: Service.Init["token"];

    constructor(args: Service.Init) {
        this.fetcher = args.fetcher ?? defaultFetcher;
        this.baseUrl = joinPaths(args.serverUrl, args.serviceBaseUrl);
        this.token = args.token;
    }

    public async getToken(
        request: endpoints.getToken.Request
    ): Promise<endpoints.getToken.Response> {
        const queryParameters = new URLSearchParams();
        queryParameters.append("grant_type", request.grant_type);
        queryParameters.append("client_id", request.client_id);

        const response = await this.fetcher({
            url: joinPaths(this.baseUrl, "/oauth2/token"),
            method: "POST",
            headers: {},
            token: this.token,
            queryParameters,
        });

        if (response.statusCode >= 200 && response.statusCode < 300) {
            return {
                ok: true,
                statusCode: response.statusCode,
                body: response.body as model.GetTokenResponse,
            };
        } else {
            return {
                ok: false,
                statusCode: response.statusCode,
                error: response.body as endpoints.getToken.ErrorBody,
            };
        }
    }
}
