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
  Optional<Codesystem_propertyType> type();

  Optional<Code> code();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Uri> uri();

  static ImmutableCodeSystem_Property.Builder builder() {
    return ImmutableCodeSystem_Property.builder();
  }
}
