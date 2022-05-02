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
  Optional<Boolean> lockedDate();

  Optional<Boolean> experimental();

  Optional<Code> language();

  Optional<TerminologycapabilitiesCodesearch> codeSearch();

  Optional<Markdown> copyright();

  Optional<TerminologyCapabilities_Closure> closure();

  Optional<Markdown> purpose();

  Optional<Uri> implicitRules();

  Optional<TerminologyCapabilities_Expansion> expansion();

  Optional<TerminologyCapabilities_Software> software();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<TerminologycapabilitiesStatus> status();

  Optional<Code> kind();

  Optional<String> title();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> jurisdiction();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> url();

  Optional<Id> id();

  Optional<String> version();

  Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem();

  Optional<String> publisher();

  Optional<TerminologyCapabilities_ValidateCode> validateCode();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<String> name();

  Optional<Markdown> description();

  Optional<TerminologyCapabilities_Translation> translation();

  Optional<TerminologyCapabilities_Implementation> implementation();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  static ImmutableTerminologyCapabilities.ResourceTypeBuildStage builder() {
    return ImmutableTerminologyCapabilities.builder();
  }
}
