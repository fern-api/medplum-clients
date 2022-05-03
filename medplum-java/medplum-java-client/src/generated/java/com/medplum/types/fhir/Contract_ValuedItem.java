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
    as = ImmutableContract_ValuedItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_ValuedItem {
  Optional<Money> unitPrice();

  Optional<String> payment();

  Optional<Money> net();

  Optional<List<Extension>> extension();

  Optional<DateTime> effectiveTime();

  Optional<Identifier> identifier();

  Optional<DateTime> paymentDate();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<Decimal> points();

  Optional<List<String>> linkId();

  Optional<Reference> responsible();

  Optional<Reference> entityReference();

  Optional<Reference> recipient();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<String> id();

  Optional<Decimal> factor();

  Optional<CodeableConcept> entityCodeableConcept();

  static ImmutableContract_ValuedItem.Builder builder() {
    return ImmutableContract_ValuedItem.builder();
  }
}
