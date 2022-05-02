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
    as = ImmutableSearchParameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SearchParameter {
  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<SearchparameterStatus> status();

  Optional<Boolean> experimental();

  Optional<String> expression();

  Optional<Markdown> description();

  Optional<String> name();

  Optional<List<Code>> base();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<DateTime> date();

  Optional<List<SearchparameterModifierItem>> modifier();

  Optional<List<Code>> target();

  Optional<Code> code();

  Optional<List<UsageContext>> useContext();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Canonical> derivedFrom();

  Optional<String> xpath();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SearchparameterComparatorItem>> comparator();

  Optional<Boolean> multipleAnd();

  Optional<Uri> url();

  Optional<Boolean> multipleOr();

  Optional<Narrative> text();

  Optional<SearchparameterXpathusage> xpathUsage();

  Optional<String> publisher();

  Optional<List<SearchParameter_Component>> component();

  Optional<List<ContactDetail>> contact();

  Optional<String> version();

  Optional<SearchparameterType> type();

  Optional<Markdown> purpose();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<String>> chain();

  static ImmutableSearchParameter.ResourceTypeBuildStage builder() {
    return ImmutableSearchParameter.builder();
  }
}
