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
    as = ImmutableImmunization_Reaction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Immunization_Reaction {
  Optional<DateTime> date();

  Optional<String> id();

  Optional<Reference> detail();

  Optional<List<Extension>> extension();

  Optional<Boolean> reported();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImmunization_Reaction.Builder builder() {
    return ImmutableImmunization_Reaction.builder();
  }
}
