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
  String resourceType();

  Optional<String> cancelledReason();

  Optional<Money> totalNet();

  Optional<Reference> subject();

  Optional<List<ResourceList>> contained();

  Optional<Reference> recipient();

  Optional<List<Invoice_PriceComponent>> totalPriceComponent();

  Optional<InvoiceStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Invoice_Participant>> participant();

  Optional<Narrative> text();

  Optional<Money> totalGross();

  Optional<List<Invoice_LineItem>> lineItem();

  Optional<Id> id();

  Optional<Reference> issuer();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<CodeableConcept> type();

  Optional<DateTime> date();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> paymentTerms();

  Optional<Reference> account();

  Optional<List<Extension>> extension();

  static ImmutableInvoice.ResourceTypeBuildStage builder() {
    return ImmutableInvoice.builder();
  }
}
