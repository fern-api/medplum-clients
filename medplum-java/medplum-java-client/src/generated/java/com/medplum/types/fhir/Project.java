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
    as = ImmutableProject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Project {
  Optional<Reference> defaultPatientAccessPolicy();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Code>> features();

  Optional<Meta> meta();

  Reference owner();

  Optional<String> resourceType();

  String name();

  Optional<String> description();

  static ImmutableProject.OwnerBuildStage builder() {
    return ImmutableProject.builder();
  }
}
