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
    as = ImmutableLibrary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Library {
  Optional<List<Extension>> extension();

  Optional<Uri> url();

  Optional<List<ContactDetail>> editor();

  Optional<String> subtitle();

  CodeableConcept type();

  Optional<String> publisher();

  Optional<Markdown> description();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Reference> subjectReference();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ParameterDefinition>> parameter();

  Optional<String> usage();

  Optional<Markdown> copyright();

  Optional<String> name();

  Optional<Date> approvalDate();

  Optional<Boolean> experimental();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Narrative> text();

  Optional<String> version();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Attachment>> content();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> purpose();

  Optional<List<ContactDetail>> author();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<LibraryStatus> status();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Date> lastReviewDate();

  Optional<String> title();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<List<ContactDetail>> reviewer();

  static ImmutableLibrary.TypeBuildStage builder() {
    return ImmutableLibrary.builder();
  }
}
