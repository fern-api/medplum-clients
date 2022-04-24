//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link List_Entry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableList_Entry.builder()}.
 */
@org.immutables.value.Generated(from = "List_Entry", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableList_Entry implements com.fhir.List_Entry {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean deleted;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept flag;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final com.fhir.Reference item;

  private ImmutableList_Entry(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean deleted,
      @javax.annotation.Nullable com.fhir.CodeableConcept flag,
      @javax.annotation.Nullable com.fhir.dateTime date,
      com.fhir.Reference item) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.deleted = deleted;
    this.flag = flag;
    this.date = date;
    this.item = item;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code deleted} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deleted")
  @Override
  public java.util.Optional<java.lang.Boolean> deleted() {
    return java.util.Optional.ofNullable(deleted);
  }

  /**
   * @return The value of the {@code flag} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("flag")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> flag() {
    return java.util.Optional.ofNullable(flag);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public com.fhir.Reference item() {
    return item;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableList_Entry(newValue, this.modifierExtension, this.extension, this.deleted, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableList_Entry(value, this.modifierExtension, this.extension, this.deleted, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableList_Entry(this.id, newValue, this.extension, this.deleted, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableList_Entry(this.id, value, this.extension, this.deleted, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, newValue, this.deleted, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, value, this.deleted, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#deleted() deleted} attribute.
   * @param value The value for deleted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDeleted(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.deleted, newValue)) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, newValue, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#deleted() deleted} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deleted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDeleted(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.deleted, value)) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, value, this.flag, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#flag() flag} attribute.
   * @param value The value for flag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withFlag(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "flag");
    if (this.flag == newValue) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, this.deleted, newValue, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#flag() flag} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for flag
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withFlag(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.flag == value) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, this.deleted, value, this.date, this.item);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List_Entry#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList_Entry withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, this.deleted, this.flag, newValue, this.item);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List_Entry#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList_Entry withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, this.deleted, this.flag, value, this.item);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link List_Entry#item() item} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for item
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableList_Entry withItem(com.fhir.Reference value) {
    if (this.item == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "item");
    return new ImmutableList_Entry(this.id, this.modifierExtension, this.extension, this.deleted, this.flag, this.date, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableList_Entry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableList_Entry
        && equalTo((ImmutableList_Entry) another);
  }

  private boolean equalTo(ImmutableList_Entry another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(deleted, another.deleted)
        && java.util.Objects.equals(flag, another.flag)
        && java.util.Objects.equals(date, another.date)
        && item.equals(another.item);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code deleted}, {@code flag}, {@code date}, {@code item}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(deleted);
    h += (h << 5) + java.util.Objects.hashCode(flag);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + item.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code List_Entry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("List_Entry{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (deleted != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("deleted=").append(deleted);
    }
    if (flag != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("flag=").append(flag);
    }
    if (date != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("item=").append(item);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "List_Entry", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.List_Entry {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> deleted = java.util.Optional.empty();
    boolean deletedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> flag = java.util.Optional.empty();
    boolean flagIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable com.fhir.Reference item;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deleted")
    public void setDeleted(java.util.Optional<java.lang.Boolean> deleted) {
      this.deleted = deleted;
      this.deletedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("flag")
    public void setFlag(java.util.Optional<com.fhir.CodeableConcept> flag) {
      this.flag = flag;
      this.flagIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(com.fhir.Reference item) {
      this.item = item;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> deleted() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> flag() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference item() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableList_Entry fromJson(Json json) {
    ImmutableList_Entry.Builder builder = ((ImmutableList_Entry.Builder) ImmutableList_Entry.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.deletedIsSet) {
      builder.deleted(json.deleted);
    }
    if (json.flagIsSet) {
      builder.flag(json.flag);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.item != null) {
      builder.item(json.item);
    }
    return (ImmutableList_Entry) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link List_Entry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable List_Entry instance
   */
  public static List_Entry copyOf(List_Entry instance) {
    if (instance instanceof ImmutableList_Entry) {
      return (ImmutableList_Entry) instance;
    }
    return ((ImmutableList_Entry.Builder) ImmutableList_Entry.builder())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .deleted(instance.deleted())
        .flag(instance.flag())
        .date(instance.date())
        .item(instance.item())
        .build();
  }

  /**
   * Creates a builder for {@link List_Entry List_Entry}.
   * <pre>
   * ImmutableList_Entry.builder()
   *    .id(String) // optional {@link List_Entry#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link List_Entry#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link List_Entry#extension() extension}
   *    .deleted(Boolean) // optional {@link List_Entry#deleted() deleted}
   *    .flag(com.fhir.CodeableConcept) // optional {@link List_Entry#flag() flag}
   *    .date(com.fhir.dateTime) // optional {@link List_Entry#date() date}
   *    .item(com.fhir.Reference) // required {@link List_Entry#item() item}
   *    .build();
   * </pre>
   * @return A new List_Entry builder
   */
  public static ItemBuildStage builder() {
    return new ImmutableList_Entry.Builder();
  }

  /**
   * Builds instances of type {@link List_Entry List_Entry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "List_Entry", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ItemBuildStage, BuildFinal {
    private static final long INIT_BIT_ITEM = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_DELETED = 0x8L;
    private static final long OPT_BIT_FLAG = 0x10L;
    private static final long OPT_BIT_DATE = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean deleted;
    private @javax.annotation.Nullable com.fhir.CodeableConcept flag;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.Reference item;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link List_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for chained invocation
     */
    public final Builder deleted(boolean deleted) {
      checkNotIsSet(deletedIsSet(), "deleted");
      this.deleted = deleted;
      optBits |= OPT_BIT_DELETED;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deleted")
    public final Builder deleted(java.util.Optional<java.lang.Boolean> deleted) {
      checkNotIsSet(deletedIsSet(), "deleted");
      this.deleted = deleted.orElse(null);
      optBits |= OPT_BIT_DELETED;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for chained invocation
     */
    public final Builder flag(com.fhir.CodeableConcept flag) {
      checkNotIsSet(flagIsSet(), "flag");
      this.flag = java.util.Objects.requireNonNull(flag, "flag");
      optBits |= OPT_BIT_FLAG;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flag")
    public final Builder flag(java.util.Optional<? extends com.fhir.CodeableConcept> flag) {
      checkNotIsSet(flagIsSet(), "flag");
      this.flag = flag.orElse(null);
      optBits |= OPT_BIT_FLAG;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link List_Entry#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link List_Entry#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(com.fhir.Reference item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      initBits &= ~INIT_BIT_ITEM;
      return this;
    }

    /**
     * Builds a new {@link List_Entry List_Entry}.
     * @return An immutable instance of List_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.List_Entry build() {
      checkRequiredAttributes();
      return new ImmutableList_Entry(id, modifierExtension, extension, deleted, flag, date, item);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean deletedIsSet() {
      return (optBits & OPT_BIT_DELETED) != 0;
    }

    private boolean flagIsSet() {
      return (optBits & OPT_BIT_FLAG) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean itemIsSet() {
      return (initBits & INIT_BIT_ITEM) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of List_Entry is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!itemIsSet()) attributes.add("item");
      return "Cannot build List_Entry, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "List_Entry", generator = "Immutables")
  public interface ItemBuildStage {
    /**
     * Initializes the value for the {@link List_Entry#item() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(com.fhir.Reference item);
  }

  @org.immutables.value.Generated(from = "List_Entry", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link List_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link List_Entry#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link List_Entry#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link List_Entry#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deleted(boolean deleted);

    /**
     * Initializes the optional value {@link List_Entry#deleted() deleted} to deleted.
     * @param deleted The value for deleted
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deleted(java.util.Optional<java.lang.Boolean> deleted);

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for chained invocation
     */
    BuildFinal flag(com.fhir.CodeableConcept flag);

    /**
     * Initializes the optional value {@link List_Entry#flag() flag} to flag.
     * @param flag The value for flag
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal flag(java.util.Optional<? extends com.fhir.CodeableConcept> flag);

    /**
     * Initializes the optional value {@link List_Entry#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link List_Entry#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Builds a new {@link List_Entry List_Entry}.
     * @return An immutable instance of List_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    List_Entry build();
  }
}
