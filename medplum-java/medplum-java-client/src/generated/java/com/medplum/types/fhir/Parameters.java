package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Parameters_Parameter>> parameter();

  String resourceType();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  static ImmutableParameters.ResourceTypeBuildStage builder() {
    return ImmutableParameters.builder();
  }
}
