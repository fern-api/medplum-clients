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
    as = ImmutablePerson_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Person_Link {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Person_linkAssurance> assurance();

  Optional<String> id();

  Reference target();

  static ImmutablePerson_Link.TargetBuildStage builder() {
    return ImmutablePerson_Link.builder();
  }
}
