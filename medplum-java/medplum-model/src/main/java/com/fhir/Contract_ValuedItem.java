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
    as = ImmutableContract_ValuedItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_ValuedItem {
  Optional<decimal> points();

  Optional<String> payment();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> entityCodeableConcept();

  Optional<Reference> recipient();

  Optional<Money> net();

  Optional<Reference> entityReference();

  Optional<Identifier> identifier();

  Optional<decimal> factor();

  Optional<List<unsignedInt>> securityLabelNumber();

  Optional<dateTime> paymentDate();

  Optional<Reference> responsible();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<Money> unitPrice();

  Optional<List<String>> linkId();

  Optional<dateTime> effectiveTime();

  static ImmutableContract_ValuedItem.Builder builder() {
    return ImmutableContract_ValuedItem.builder();
  }
}
