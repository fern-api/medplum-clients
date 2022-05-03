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
  Reference project();

  Optional<Reference> accessPolicy();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Reference> userConfiguration();

  Reference profile();

  Optional<Boolean> admin();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Reference user();

  Optional<String> resourceType();

  static ImmutableProjectMembership.ProjectBuildStage builder() {
    return ImmutableProjectMembership.builder();
  }
}
