package org.openapitools.api;

import org.openapitools.model.Client;

import java.ws.rs.*;
import java.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/another-fake/dummy")
@Api(description = "the another-fake API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public interface AnotherFakeApi {

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test special tags", notes = "To test special tags and operation ID starting with number", tags={ "$another-fake?" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    Client call123testSpecialTags(@Valid @NotNull Client body);
}
