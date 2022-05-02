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
  Optional<Money> net();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<Money> unitPrice();

  Optional<Decimal> points();

  Optional<Reference> entityReference();

  Optional<DateTime> effectiveTime();

  Optional<Reference> responsible();

  Optional<Reference> recipient();

  Optional<List<String>> linkId();

  Optional<CodeableConcept> entityCodeableConcept();

  Optional<Quantity> quantity();

  Optional<Decimal> factor();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<DateTime> paymentDate();

  Optional<String> payment();

  Optional<List<UnsignedInt>> securityLabelNumber();

  static ImmutableContract_ValuedItem.Builder builder() {
    return ImmutableContract_ValuedItem.builder();
  }
}
