package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAccessPolicy_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AccessPolicy_Resource {
  Optional<Reference> compartment();

  Optional<Boolean> readonly();

  Optional<List<String>> hiddenFields();

  Optional<List<String>> readonlyFields();

  Optional<String> resourceType();

  static ImmutableAccessPolicy_Resource.Builder builder() {
    return ImmutableAccessPolicy_Resource.builder();
  }
}
