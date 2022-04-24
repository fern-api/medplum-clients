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
    as = ImmutableSupplyDelivery.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyDelivery {
  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<SupplydeliveryStatus> status();

  Optional<Reference> patient();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<Timing> occurrenceTiming();

  Optional<Narrative> text();

  Optional<Reference> supplier();

  Optional<Reference> destination();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<Reference>> receiver();

  String resourceType();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> basedOn();

  Optional<Period> occurrencePeriod();

  Optional<String> occurrenceDateTime();

  Optional<code> language();

  Optional<Meta> meta();

  Optional<SupplyDelivery_SuppliedItem> suppliedItem();

  static ImmutableSupplyDelivery.ResourceTypeBuildStage builder() {
    return ImmutableSupplyDelivery.builder();
  }
}
