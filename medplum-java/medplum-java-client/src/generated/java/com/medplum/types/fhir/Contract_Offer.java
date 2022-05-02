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
    as = ImmutableContract_Offer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Offer {
  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> decisionMode();

  Optional<String> text();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<List<Identifier>> identifier();

  Optional<List<Contract_Party>> party();

  Optional<Reference> topic();

  Optional<CodeableConcept> decision();

  Optional<List<Contract_Answer>> answer();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<String>> linkId();

  static ImmutableContract_Offer.Builder builder() {
    return ImmutableContract_Offer.builder();
  }
}
