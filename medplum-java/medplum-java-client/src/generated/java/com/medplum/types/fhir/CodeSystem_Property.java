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
    as = ImmutableCodeSystem_Property.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Property {
  Optional<Uri> uri();

  Optional<String> description();

  Optional<Codesystem_propertyType> type();

  Optional<Code> code();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCodeSystem_Property.Builder builder() {
    return ImmutableCodeSystem_Property.builder();
  }
}
