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
    as = ImmutableInvoice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice {
  Optional<Markdown> paymentTerms();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<InvoiceStatus> status();

  Optional<Reference> recipient();

  Optional<Reference> account();

  Optional<Money> totalNet();

  Optional<List<Extension>> extension();

  Optional<List<Invoice_PriceComponent>> totalPriceComponent();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Invoice_Participant>> participant();

  Optional<List<Invoice_LineItem>> lineItem();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Reference> subject();

  Optional<Code> language();

  Optional<CodeableConcept> type();

  Optional<String> cancelledReason();

  Optional<Reference> issuer();

  Optional<Narrative> text();

  Optional<Money> totalGross();

  Optional<DateTime> date();

  String resourceType();

  static ImmutableInvoice.ResourceTypeBuildStage builder() {
    return ImmutableInvoice.builder();
  }
}
