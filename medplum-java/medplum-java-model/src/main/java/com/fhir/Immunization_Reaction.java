package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Boolean> reported();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> date();

  Optional<Reference> detail();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableImmunization_Reaction.Builder builder() {
    return ImmutableImmunization_Reaction.builder();
  }
}
