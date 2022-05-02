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

  Optional<CodeableConcept> entityCodeableConcept();

  Optional<Decimal> points();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<Reference> responsible();

  Optional<String> payment();

  Optional<Identifier> identifier();

  Optional<Money> net();

  Optional<Reference> recipient();

  Optional<List<String>> linkId();

  Optional<String> id();

  Optional<Money> unitPrice();

  Optional<DateTime> paymentDate();

  Optional<Decimal> factor();

  Optional<Reference> entityReference();

  Optional<Quantity> quantity();

  Optional<DateTime> effectiveTime();

  Optional<List<Extension>> extension();

  static ImmutableContract_ValuedItem.Builder builder() {
    return ImmutableContract_ValuedItem.builder();
  }
}
