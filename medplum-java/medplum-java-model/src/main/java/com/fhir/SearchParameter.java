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
    as = ImmutableSearchParameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SearchParameter {
  Optional<canonical> derivedFrom();

  Optional<List<UsageContext>> useContext();

  Optional<SearchparameterStatus> status();

  Optional<dateTime> date();

  Optional<Narrative> text();

  Optional<SearchparameterType> type();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<markdown> description();

  Optional<List<SearchparameterModifierItem>> modifier();

  Optional<Meta> meta();

  Optional<SearchparameterXpathusage> xpathUsage();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<uri> url();

  Optional<String> version();

  Optional<String> xpath();

  Optional<List<SearchparameterComparatorItem>> comparator();

  Optional<String> name();

  Optional<List<code>> target();

  Optional<Boolean> experimental();

  Optional<code> code();

  Optional<List<ContactDetail>> contact();

  Optional<id> id();

  Optional<Boolean> multipleAnd();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<List<ResourceList>> contained();

  Optional<code> language();

  Optional<markdown> purpose();

  Optional<List<code>> base();

  Optional<Boolean> multipleOr();

  Optional<List<String>> chain();

  Optional<uri> implicitRules();

  Optional<String> expression();

  Optional<List<SearchParameter_Component>> component();

  static ImmutableSearchParameter.ResourceTypeBuildStage builder() {
    return ImmutableSearchParameter.builder();
  }
}
