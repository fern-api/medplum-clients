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
    as = ImmutableInvoice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice {
  Optional<List<Annotation>> note();

  Optional<Reference> account();

  String resourceType();

  Optional<Money> totalNet();

  Optional<String> cancelledReason();

  Optional<Reference> issuer();

  Optional<Reference> subject();

  Optional<List<Invoice_LineItem>> lineItem();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<code> language();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Reference> recipient();

  Optional<Money> totalGross();

  Optional<markdown> paymentTerms();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<InvoiceStatus> status();

  Optional<List<Invoice_PriceComponent>> totalPriceComponent();

  Optional<dateTime> date();

  Optional<List<Invoice_Participant>> participant();

  static ImmutableInvoice.ResourceTypeBuildStage builder() {
    return ImmutableInvoice.builder();
  }
}
