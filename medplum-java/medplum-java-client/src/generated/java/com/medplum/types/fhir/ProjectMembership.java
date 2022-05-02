package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProjectMembership.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProjectMembership {
  Optional<Reference> accessPolicy();

  Optional<String> resourceType();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<Boolean> admin();

  Optional<Meta> meta();

  Optional<Reference> userConfiguration();

  Reference project();

  Reference profile();

  Optional<Code> language();

  Reference user();

  static ImmutableProjectMembership.ProjectBuildStage builder() {
    return ImmutableProjectMembership.builder();
  }
}
