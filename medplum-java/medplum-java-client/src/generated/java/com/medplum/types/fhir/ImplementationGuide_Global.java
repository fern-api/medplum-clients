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
    as = ImmutableImplementationGuide_Global.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Global {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> type();

  Optional<String> id();

  Canonical profile();

  static ImmutableImplementationGuide_Global.ProfileBuildStage builder() {
    return ImmutableImplementationGuide_Global.builder();
  }
}
