package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableLinkage_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Linkage_Item {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Reference resource();

  Optional<List<Extension>> extension();

  Optional<Linkage_itemType> type();

  static ImmutableLinkage_Item.ResourceBuildStage builder() {
    return ImmutableLinkage_Item.builder();
  }
}
