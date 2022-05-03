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
  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> copyright();

  Optional<Boolean> lockedDate();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem();

  Optional<TerminologyCapabilities_Implementation> implementation();

  Optional<List<Extension>> extension();

  Optional<List<UsageContext>> useContext();

  Optional<String> version();

  Optional<String> title();

  Optional<TerminologycapabilitiesCodesearch> codeSearch();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<TerminologyCapabilities_ValidateCode> validateCode();

  Optional<List<ResourceList>> contained();

  Optional<TerminologyCapabilities_Expansion> expansion();

  Optional<Code> language();

  Optional<TerminologycapabilitiesStatus> status();

  Optional<Code> kind();

  Optional<TerminologyCapabilities_Translation> translation();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Uri> implicitRules();

  Optional<Uri> url();

  Optional<TerminologyCapabilities_Software> software();

  Optional<Markdown> description();

  Optional<String> name();

  Optional<TerminologyCapabilities_Closure> closure();

  Optional<Markdown> purpose();

  static ImmutableTerminologyCapabilities.ResourceTypeBuildStage builder() {
    return ImmutableTerminologyCapabilities.builder();
  }
}
