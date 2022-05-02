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
  Optional<Code> language();

  Optional<List<Invoice_PriceComponent>> totalPriceComponent();

  Optional<Narrative> text();

  Optional<Money> totalGross();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<InvoiceStatus> status();

  Optional<Reference> account();

  Optional<CodeableConcept> type();

  Optional<Meta> meta();

  Optional<String> cancelledReason();

  Optional<DateTime> date();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<Annotation>> note();

  Optional<Reference> recipient();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> issuer();

  Optional<Uri> implicitRules();

  Optional<Money> totalNet();

  Optional<List<Invoice_LineItem>> lineItem();

  Optional<List<Invoice_Participant>> participant();

  Optional<Reference> subject();

  Optional<Markdown> paymentTerms();

  static ImmutableInvoice.ResourceTypeBuildStage builder() {
    return ImmutableInvoice.builder();
  }
}
