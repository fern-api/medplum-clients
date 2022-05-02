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
    as = ImmutablePerson_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Person_Link {
  Optional<List<Extension>> modifierExtension();

  Reference target();

  Optional<String> id();

  Optional<Person_linkAssurance> assurance();

  Optional<List<Extension>> extension();

  static ImmutablePerson_Link.TargetBuildStage builder() {
    return ImmutablePerson_Link.builder();
  }
}