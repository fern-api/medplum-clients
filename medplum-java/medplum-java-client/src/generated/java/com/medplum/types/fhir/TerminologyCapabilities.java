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
  Optional<List<ContactDetail>> contact();

  Optional<TerminologycapabilitiesCodesearch> codeSearch();

  Optional<String> version();

  Optional<String> title();

  Optional<TerminologyCapabilities_Software> software();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  String resourceType();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<Markdown> description();

  Optional<List<Extension>> modifierExtension();

  Optional<TerminologyCapabilities_Closure> closure();

  Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem();

  Optional<String> name();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Uri> url();

  Optional<Uri> implicitRules();

  Optional<TerminologyCapabilities_Implementation> implementation();

  Optional<Boolean> lockedDate();

  Optional<TerminologyCapabilities_Translation> translation();

  Optional<List<UsageContext>> useContext();

  Optional<Markdown> purpose();

  Optional<TerminologyCapabilities_ValidateCode> validateCode();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<TerminologycapabilitiesStatus> status();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<List<ResourceList>> contained();

  Optional<Code> kind();

  Optional<List<Extension>> extension();

  Optional<TerminologyCapabilities_Expansion> expansion();

  static ImmutableTerminologyCapabilities.ResourceTypeBuildStage builder() {
    return ImmutableTerminologyCapabilities.builder();
  }
}
