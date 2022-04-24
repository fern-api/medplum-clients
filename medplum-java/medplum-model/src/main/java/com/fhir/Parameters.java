package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableParameters.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Parameters {
  String resourceType();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<List<Parameters_Parameter>> parameter();

  static ImmutableParameters.ResourceTypeBuildStage builder() {
    return ImmutableParameters.builder();
  }
}
