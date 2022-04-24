package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<TerminologyCapabilities_Implementation> implementation();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<TerminologyCapabilities_Expansion> expansion();

  Optional<TerminologycapabilitiesCodesearch> codeSearch();

  Optional<String> publisher();

  Optional<List<Extension>> extension();

  Optional<String> title();

  Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem();

  Optional<List<ResourceList>> contained();

  Optional<String> name();

  Optional<markdown> copyright();

  Optional<TerminologyCapabilities_ValidateCode> validateCode();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> description();

  Optional<dateTime> date();

  Optional<List<UsageContext>> useContext();

  Optional<TerminologyCapabilities_Translation> translation();

  Optional<String> version();

  Optional<TerminologycapabilitiesStatus> status();

  Optional<code> language();

  Optional<Narrative> text();

  Optional<uri> implicitRules();

  Optional<TerminologyCapabilities_Software> software();

  String resourceType();

  Optional<Boolean> experimental();

  Optional<markdown> purpose();

  Optional<Boolean> lockedDate();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<code> kind();

  Optional<uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<TerminologyCapabilities_Closure> closure();

  static ImmutableTerminologyCapabilities.ResourceTypeBuildStage builder() {
    return ImmutableTerminologyCapabilities.builder();
  }
}
