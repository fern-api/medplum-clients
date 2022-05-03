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
  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  Optional<Code> language();

  Optional<List<Invoice_Participant>> participant();

  Optional<List<Annotation>> note();

  Optional<InvoiceStatus> status();

  Optional<Markdown> paymentTerms();

  Optional<Reference> issuer();

  Optional<Money> totalNet();

  Optional<Reference> subject();

  Optional<Reference> recipient();

  Optional<CodeableConcept> type();

  Optional<Reference> account();

  Optional<Narrative> text();

  Optional<Money> totalGross();

  Optional<List<Extension>> modifierExtension();

  Optional<String> cancelledReason();

  Optional<List<Extension>> extension();

  Optional<List<Invoice_LineItem>> lineItem();

  Optional<Meta> meta();

  Optional<List<Invoice_PriceComponent>> totalPriceComponent();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Id> id();

  static ImmutableInvoice.ResourceTypeBuildStage builder() {
    return ImmutableInvoice.builder();
  }
}
