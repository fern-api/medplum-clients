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
  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Reference profile();

  Optional<Boolean> admin();

  Optional<Reference> userConfiguration();

  Optional<String> resourceType();

  Optional<Id> id();

  Reference user();

  Reference project();

  Optional<Reference> accessPolicy();

  static ImmutableProjectMembership.ProfileBuildStage builder() {
    return ImmutableProjectMembership.builder();
  }
}
