package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Fixture.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Fixture {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Boolean> autocreate();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> resource();

  Optional<Boolean> autodelete();

  static ImmutableTestScript_Fixture.Builder builder() {
    return ImmutableTestScript_Fixture.builder();
  }
}