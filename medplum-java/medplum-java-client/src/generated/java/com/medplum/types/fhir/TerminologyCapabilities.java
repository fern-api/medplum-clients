package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTerminologyCapabilities.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities {
  Optional<Boolean> experimental();

  Optional<TerminologyCapabilities_ValidateCode> validateCode();

  Optional<TerminologyCapabilities_Translation> translation();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<UsageContext>> useContext();

  Optional<String> title();

  Optional<TerminologyCapabilities_Implementation> implementation();

  Optional<Uri> implicitRules();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<TerminologyCapabilities_Closure> closure();

  Optional<Code> kind();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> purpose();

  Optional<String> version();

  Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem();

  Optional<TerminologycapabilitiesCodesearch> codeSearch();

  Optional<String> publisher();

  String resourceType();

  Optional<Markdown> copyright();

  Optional<TerminologyCapabilities_Software> software();

  Optional<TerminologyCapabilities_Expansion> expansion();

  Optional<String> name();

  Optional<Markdown> description();

  Optional<Id> id();

  Optional<Uri> url();

  Optional<Boolean> lockedDate();

  Optional<TerminologycapabilitiesStatus> status();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<DateTime> date();

  static ImmutableTerminologyCapabilities.ResourceTypeBuildStage builder() {
    return ImmutableTerminologyCapabilities.builder();
  }
}
