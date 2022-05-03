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
  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> effectiveTime();

  Optional<List<String>> linkId();

  Optional<String> payment();

  Optional<Decimal> factor();

  Optional<CodeableConcept> entityCodeableConcept();

  Optional<Decimal> points();

  Optional<Money> net();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<Identifier> identifier();

  Optional<String> id();

  Optional<Money> unitPrice();

  Optional<List<Extension>> extension();

  Optional<Reference> recipient();

  Optional<Reference> entityReference();

  Optional<Quantity> quantity();

  Optional<Reference> responsible();

  Optional<DateTime> paymentDate();

  static ImmutableContract_ValuedItem.Builder builder() {
    return ImmutableContract_ValuedItem.builder();
  }
}
